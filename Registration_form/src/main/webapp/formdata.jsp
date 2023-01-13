<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="entities.formdata"%>
<%@page import="org.hibernate.Session"%>
<%@page import="entities.FactoryProvider"%>

<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<h2 style="text-align: center;;">Form Data</h2>
<div class="container">
<table>
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Job Title</th>
    <th>Message</th>
    <th> Delete</th>
    <th> Update</th>
  </tr>
  
  <% Session s=FactoryProvider.getFactory().openSession();
       Query q = s.createQuery("from formdata");
       List<formdata> fd= q.list();
          for(formdata f:fd){
        	  %>   	  
        <tr>	  
       	 <td><%=f.getFirstName() %></td>
        <td><%=f.getLastName() %></td>
        <td><%=f.getPhone() %></td>
        <td><%=f.getPersonMail() %></td>
        <td><%=f.getLookingProfile() %></td>
        <td><%=f.getPersonMsg() %></td>
        <td><a href="delete?id=<%=f.getPersonid()%> ">Delete</a></td>	           
        	
        <td><a href="Update.jsp?id=<%=f.getPersonid()%>" >Update</a></td>
        	</tr>           
            <%  }
          s.close();
  %>
  
 
  
</table>
  </div>
  </body>