<#escape x as x?html>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Video data</title>
<style>
body{background: #DEF3CA;}
table, th, td {
   border: 1px solid black;
    border-collapse: collapse;
     border-style: solid;
    border-color: #98bf21;
}
td{
padding:5px;
text-align: center
}
.center{
 margin-left:auto; 
 margin-right:auto;
}
.table-title {
background:#9ED929;
}
.table-content{
background-color: #FFFFFF;
}
.table-content:hover {
    background-color: #ffff99;
}
.item-title{
text-align: center;
font-weight: bold;
padding:5px;
}

.item-media-content{
padding: 10px;
}

.item-general-content{
padding: 10px;
}
.channel-title{
text-align: center;
font-weight: bold;
padding:5px;
}
.channel-info{
padding: 10px;
}

.media-title{
text-align: center;
font-weight: bold;
padding:5px;
}
.item-box{
border: 4px double black;
padding: 10px;
margin-top:10px;
}
</style>
</head>
<body>

<div class="channel-title">
Channel info
</div>

<div class="channel-info">
<table class="center">
<tr class="table-title">
<td><b>Title</b></td>
<td><b>Description</b></td>
</tr>
<tr class="table-content">
<td>${title}</td>
<td>${description}</td>
</tr>
</table>
</div>


<#list items as item>
  <div class="item-box">  
<div class="item-title">
Item  ${item_index + 1} general info
</div>

<div class="item-general-content">
<table>
<tr class="table-title">
<td><b>Title</b></td>
<td><b>Link</b></td>
<td><b>Guid</b></td>
<td><b>Desription</td>
<td><b>Publish Date</b></td>
</tr>

<tr class="table-content">
<td>${item.title}</td>
<td>${item.link}</td>
<td>${item.guid.content}</td>
<td>${item.description}</td>
<td>${item.publishDate}</td>


</tr>

</table>
</div>

<div class="media-title">
Item media info
</div>
<div class="item-media-content">
<table >
<tr class="table-title"> 
<td><b>Title</b></td>
<td><b>Copyright</b></td>
<td><b>Keywords</b></td>
<td><b>Thumbnail</b></td>
<td><b>Content</b></td>
<td><b>Restriction</b></td>
<td><b>Category </b></td>
<td><b>Valid</b></td>
</tr>

<tr class="table-content">
<td>${item.group.title}</td>
<td>${item.group.copyright}</td>
<td><#if item.group.keywords ??>${item.group.keywords}</#if></td>
<td>${item.group.thumbnail}</td>
<td>${item.group.content}</td>
<td>${item.group.restriction.content}</td>
<td>${item.group.category.content}</td>
<td>${item.group.valid}</td>
</tr>
</table>
</div>
</div>
</#list>
</body>
</html>
</#escape>