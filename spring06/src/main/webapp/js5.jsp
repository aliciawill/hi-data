<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);
      
      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['하는 일', '시간'],
          ['수업',     8],
          ['식사',      3],
          ['이동',  2],
          ['운동', 1],
          ['공부', 3],
          ['잠자',    7]
        ]);

        var options = {
          title: 'My Daily Activities'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
        
        
        /* -------------------- */
        var data2 = google.visualization.arrayToDataTable([
            ['하는 일2', '시간2'],
            ['수업2',     8],
            ['식사2',      3],
            ['이동2',  2],
            ['운동2', 1],
            ['공부2', 3],
            ['잠자2',    7]
          ]);

          var options2 = {
            title: 'i am title'
          };

          var chart2 = new google.visualization.PieChart(document.getElementById('piechart2'));

          chart2.draw(data2, options2);
          
      }
    </script>
  </head>
  <body>
    <div id="piechart" style="width: 300px; height: 300px;"></div>
    <div id="piechart2" style="width: 300px; height: 300px;"></div>
  </body>
</html>
