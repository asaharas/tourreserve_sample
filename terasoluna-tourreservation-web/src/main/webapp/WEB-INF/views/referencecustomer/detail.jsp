<div class="container">

  <t:messagesPanel />
  
  <c:if test="${empty resultMessages}">
    <p id="messages1" class="box">
          顧客詳細画面です。
    </p>
  
	<table id="customerTable">
	  <tr>
	    <td>フリガナ</td>
	    <td>${f:h(customer.customerKana)}</td>
	  </tr>
	  <tr>
	    <td>氏名</td>
	    <td>${f:h(customer.customerName)}</td>
	  </tr>
	  <tr>
	    <td>誕生日</td>
	    <td>
	      <fmt:formatDate value="${customer.customerBirth}" pattern="yyyy年MM月dd日" />
	    </td>
	  </tr>
	  <tr>
	    <td>職業</td>
	    <td>${f:h(customer.customerJob)}</td>
	  </tr>
	  <tr>
	    <td>Eメール</td>
	    <td>${f:h(customer.customerMail)}</td>
	  </tr>
	  <tr>
	    <td>電話番号</td>
	    <td>${f:h(customer.customerTel)}</td>
	  </tr>
	  <tr>
	    <td>郵便番号</td>
	    <td>${f:h(customer.customerPost)}</td>
	  </tr>
	  <tr>
	    <td>住所</td>
	    <td>${f:h(customer.customerAdd)}</td>
	  </tr>
	</table>
  </c:if>
</div>