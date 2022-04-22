<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script>
  $(function(){
    $('#btn').click(function(){
      const imageInput = $("#file")[0];
      // 파일을 여러개 선택할 수 있으므로 files 라는 객체에 담긴다.
      //console.log("imageInput: ", imageInput.files)
    
      if(imageInput.files.length === 0){
        alert("파일은 선택해주세요");
        return;
      }
    
      var form = $('#form')[0];
      const formData = new FormData(form);
      formData.append("file", imageInput.files[0]);
      formData.append("name", $('#name').val())
    
      $.ajax({
        type:"POST",
        url: "uploadForm",
        processData: false,
        contentType: false,
        cache: false,
        timeout : 600000,
        enctype: 'multipart/form-data',
        data: formData,
        success: function(message){
          console.log("message: ", message)
        },
        err: function(err){
          console.log("err:", err)
        }
      })
    })
  })
</script>
</head>
<body>
  <form id="form" method="post" enctype="multipart/form-data" >
파일 선택하세요. <input type="file" name="file" id="file"><br>
your name <input type="text" name="name"><br>
<button id="btn">파일 업로드</button>
</form>
</body>
</html>