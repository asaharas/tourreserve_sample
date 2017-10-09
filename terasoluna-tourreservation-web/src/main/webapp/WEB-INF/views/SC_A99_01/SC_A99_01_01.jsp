<div class="container">
  <p id="messagesArea" class="box">
    メニュー画面です。
  </p>
  <div class="span-24 last">
    <form:form method="get" action="${pageContext.request.contextPath}/tours">
      <fieldset class="notice">
        <div class="span-5">
          <button id="searchTourBtn" name="initForm" style="width: 150px;">
            ツアー検索する
          </button>
        </div>
        <div class="span-18 last">
          <p>
            条件を指定してツアーを検索できます。<br>検索したツアーの予約もできます。予約にはログインが必要です。
          </p>
        </div>
      </fieldset>
    </form:form>

    <form:form method="get" action="${pageContext.request.contextPath}/customers/create">
      <fieldset class="notice">
        <div class="span-5">
          <button id="customerRegisterBtn" name="form" style="width: 150px;">
            顧客登録する
          </button>
        </div>
        <div class="span-18 last">
          <p>
            お客様の情報を入力し、会員登録します
          </p>
        </div>
      </fieldset>
    </form:form>
  </div>
</div>
