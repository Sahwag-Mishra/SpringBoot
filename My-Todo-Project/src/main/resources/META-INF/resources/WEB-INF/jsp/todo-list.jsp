
	      
	      <%@ include file="common/navigation.jspf" %>
	      <%@include file="common/header.jspf"%>
	       <div class="container"
	        <h1>Your Todos</h1>
							       <table class="table">
							       		<thead>
							       		    <tr>
							       		       <th>Id</th>
							       		       <th>description</th>
							       		       <th>targestDate</th>
							       		       <th>done</th>
							       		       <th></th>
							       		       <th></th>
							       		    
							       		    </tr>
							       		  
							       		</thead>
							       
							       
							       <tbody>
							       		<c:forEach items="${todos}" var="todo">
							       		<tr>
							       		  <td>${todo.id}</td>
							       		  <td>${todo.description}</td>
							       		  <td>${todo.targetDate}</td>
							       	      <td>${todo.done}</td>
							       	      <td>  <a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a>  </td>
							       	      <td>  <a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a>  </td>
							       		</tr>
							       		
							       		</c:forEach>
							       
							       </tbody>
							       
							       
							       
							       </table>
							     <a href="add-todo" class="btn btn-success">Add-todo</a>
			</div>
			
		     
			<%@include file="common/footer.jspf" %>
						   
	   </body>
	   
	   
	   
</html>
