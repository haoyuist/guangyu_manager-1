<@model.webheadsearch />
	<div class="page">
		<div class="content">
			<form id="formdata">
				<div class="page-login" style="margin-top: 1rem">
					<div class="list-block inset text-center">
						<ul>
							<li>
								<div class="item-content">
									<div class="item-inner">
										<div class="item-input">
											<input type="text" class="input_enter"
												placeholder="请粘贴从淘宝或京东复制的商品地址" name="product_url">											
										</div>										
									</div>
								</div>
							</li>							
							<!-- 暂时屏蔽掉
							<li>
								<div class="item-content">
									<div class="item-media">
										<i class="icon icon-form-name"></i>
									</div>
									<div class="item-inner" style="padding:0">
										<div class="item-input">
											<input id="vcode" maxlength="5" class="input_enter" type="text" placeholder="输入验证码"
												name="codeimage">
										</div>
										<div class="item-title label" style="width:100px;height:35px;">
											 <img id="num" height="35" src="/getCode?%27+(new%20Date()).getTime()" onclick="document.getElementById('num').src='/getCode?'+(new Date()).getTime()"  alt="换一换" title="换一换" class="codeimage">
										</div>
										
									</div>
								</div>
							</li>
							-->
						</ul>
					</div>
					<div class="content-block">
						<p>
							<a class="button button-big button-fill external"
								data-transition='fade' id="submitlogin" onclick="fetch();">搜返利</a>
						</p>
						<p class='text-center signup'>                               
								<a href="/order.html"
								class='pull-left external' style="font-size: 0.8rem;">我要录入订单号</a>
								<a href="/api/invitation.html"
								class='pull-center external' style="font-size: 0.8rem;color:red">拿奖励</a>
								&nbsp;&nbsp;&nbsp;
								<a href="/helptbios.html"
								class='pull-center external' style="font-size: 0.8rem;color:red">操作指南</a>
								<a href="/searchorder.html"
								class='pull-right external' style="font-size: 0.8rem;">我要提现</a>
								
						</p>
					</div>
			</form>
		</div> 

		<div id="result" align="center">
		  <a href="/api/invitation.html"><img id="search" width="90%" height="90%" src="http://help.guangfish.com/imgs/invitation.png"></a>
		  <br/><font style="color: red;">【花钱也能赚钱、让逛鱼带你飞】</font>
		  <br/><font style="font-size: 0.6rem;color: red;">往下拉查看保存书签、商品链接复制</font>
		  <br/><font style="font-size: 0.6rem;color: red;">保存书签：请在手机浏览器打开本页面，并保存成书签</font>
		  <br/><img width="90%" src="http://help.guangfish.com/imgs/bookmark.png">
		  <br/><img width="90%" src="http://help.guangfish.com/imgs/ios-taobao-jd.png">
		  <br/><img width="90%" src="http://help.guangfish.com/imgs/andorid-taobao.png">
		  <br/><img width="90%" src="http://help.guangfish.com/imgs/wx.png">
		</div>	

	</div>

	<script type='text/javascript' src='/static/front/js/jquery.min.js' charset='utf-8'></script>
	<script type='text/javascript' src='/static/front/js/light7.js' charset='utf-8'></script>
	<script>	    	    
		function drump(link) {
			//location.href=link;
		  if(isContains(link,"taobao.com")){
			if(isWeiXin()){
			  alert("无法用微信浏览器打开淘宝商品页，建议您在手机浏览器中打开本网址，并保存成书签。操作步骤：按右上角'...' 苹果手机选择'在Safari中打开'，安卓手机选择'在浏览器打开'；也可以选择'复制链接'，在喜欢的浏览器打开；");
			}else{
			  window.open(link);
			}
		  }else{
		    window.open(link);
		  }		
		}
		
		function isContains(str, substr) {
         return str.indexOf(substr) >= 0;
        }
		
		//判断是否是微信浏览器的函数
        function isWeiXin(){
          //window.navigator.userAgent属性包含了浏览器类型、版本、操作系统类型、浏览器引擎类型等信息，这个属性可以用来判断浏览器类型
          var ua = window.navigator.userAgent.toLowerCase();
          //通过正则表达式匹配ua中是否含有MicroMessenger字符串
          if(ua.match(/MicroMessenger/i) == 'micromessenger'){
            return true;
          }else{
            return false;
          }
        }
		
		function vcodevalid() {
			var vcode = $('#vcode').val();

			if (!vcode) {
				alert("请输入验证码！");
				return -1;
			}
			if(vcode.toString().length!=5){
			  alert("验证码输入不正确！");
			  return -2;
			}
			 
			var dt=0;

				$
						.ajax({
							type : "post",
							url : "/api/vcodevaild",
							contentType : "application/json",
							dataType : "json",// 返回json格式的数据
							async:false,
							data : JSON.stringify({
								"vcode" : vcode
							}),
							timeout : 30000,
							success : function(data) {
								console.log('请求到的数据为：', data)
								if(data.ret.result=="0"){
								  dt=0;
								}else{
								  dt=1;
								}					
							},
							error : function(XMLHttpRequest, textStatus,
									errorThrown) {
								console.log('请求失败')
							}
						});
						return dt;
		}

		function fetch() {		    	
			$('#e-c').remove();
			var producturl = $('.input_enter').val();
			var reg = /http(s)?:\/\/([\w-]+\.)+[\w-]+(\/[\w- .\/?%&=]*)?/;
			if (!reg.test(producturl)) {
				alert("请输入有效的地址！");
				return;
			}else{
			  //暂时屏蔽掉
			  //var adt=vcodevalid();
			  //if(adt==-1 || adt==-2){
			  //  return;
			  //}			  
			  //if(!(adt==0)){
		      //  alert("验证码验证失败");
		      //  return;
		      //}else{		        
		      //  document.getElementById('num').src='/getCode?'+(new Date()).getTime();
		      //}
			}
            $('#submitlogin').removeAttr('onclick');
			//加载中						
			$('#result')
					.html(
							"<div id='waiting'><img src='http://help.guangfish.com/imgs/timg.gif'><br/><br/><img width='80%' src='http://help.guangfish.com/imgs/search0"+Math.ceil(Math.random()*5)+".gif'></div>");			
			
			if (producturl) {
				$
						.ajax({
							type : "post",
							url : "/api/productInfo", 
							contentType : "application/json",
							dataType : "json",// 返回json格式的数据
							data : JSON.stringify({
								"user_id" : "",
								"product_url" : producturl
							}),
							timeout : 30000, 
							success : function(data) {
								console.log('请求到的数据为：', data)
								$('#waiting').remove(); 
								if (JSON.stringify(data) == "{}") {
									$('#result')
											.html(
													"<div id='e-c' align=center><div style='font-size:12px;width:330px;top:10%;left:38%;background:#fff;border-radius:10px;box-shadow:5px 5px 10px #888;'><h2 style='padding:5px;font-size:18px;'>该商品无佣金</h2></div></div>");
								} else {
								    if(data.ret.code==101){
								      if(data.ret.result.status=="4"){
								        alert("系统只支持手机淘宝、京东的商品地址");
								      }
								      else if(data.ret.result.status=="1"){
								        alert("系统繁忙，请稍后再试");
								      }
								      else if(data.ret.result.status=="2"){
								        alert("请输入商品链接地址");
								      }
								      else if(data.ret.result.status=="3"){
								        alert("商品链接地址不正确");
								      }
								      else{
								        alert("系统忙，请重新再试！");
								      }								      
								    }else{								     
								      if(data.ret.result.status=="0"){
								        $('#result').html(data.ret.result.msg);
								      }
								    }							    
								}
								$(".input_enter").val("");
								//暂时屏蔽掉
								$("#vcode").val("");
								
								$('#submitlogin').attr('onclick','fetch()');
							},
							error : function(XMLHttpRequest, textStatus,
									errorThrown) {
								console.log('请求失败')
							}
						});
			} else {
				alert("请输入商品地址后再查询");
			}
		}
		
	</script>
<@model.webendsearch />
