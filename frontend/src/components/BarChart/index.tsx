import axios from "axios";
import { useEffect, useState } from "react";
import Chart from "react-apexcharts";
import { SaleSucces } from "types/sale";
import { round } from "utils/format";
import { BASE_URL } from "utils/request";

type SeriesData = {
  name: string;
  data: number[];
};

type ChartData = {
  labels: {
    categories: string[];
  };
  series: SeriesData[];
};

const BarChart = () => {
  const [chartData, setChartData] = useState<ChartData>({
    labels: {
      categories: [],
    },
    series: [
      {
        name: "",
        data: [],
      },
    ],
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/sales/succes-by-seller`).then((response) => {
      const data = response.data as SaleSucces[];
      const myLabels = data.map((seller) => seller.sellerName);
      const mySeries = data.map((seller) =>
        round((100.0 * seller.deals) / seller.visited, 1)
      );

      setChartData({
        labels: {
          categories: myLabels,
        },
        series: [
          {
            name: "% Succes",
            data: mySeries,
          },
        ],
      });
    });
  }, []);

  const options = {
    plotOptions: {
      bar: {
        horizontal: true,
      },
    },
  };

  return (
    <Chart
      options={{ ...options, xaxis: chartData.labels }}
      series={chartData.series}
      type="bar"
      height="240"
    />
  );
};

export default BarChart;
