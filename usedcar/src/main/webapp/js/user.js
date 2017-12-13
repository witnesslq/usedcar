var areaData = address;
var $form;
var form;
var $;
layui.config({
	base : "../../js/"
}).use(['form','layer','upload','laydate'],function(){
	form = layui.form();
	var layer = parent.layer === undefined ? layui.layer : parent.layer;
		$ = layui.jquery;
		$form = $('form');
		laydate = layui.laydate;
        loadProvince(); //加载省信息


    //添加验证规则
    form.verify({
        newPwd : function(value, item){
            if(value.length < 6){
                return "密码长度不能小于6位";
            }
        },
        confirmPwd : function(value, item){
            if(!new RegExp($("#oldPwd").val()).test(value)){
                return "两次输入密码不一致，请重新输入！";
            }
        }
    })

    //判断是否修改过用户信息，如果修改过则填充修改后的信息
  /*  if(window.sessionStorage.getItem('userInfo')){
        var userInfo = JSON.parse(window.sessionStorage.getItem('userInfo'));
        var citys;
        $(".realName").val(userInfo.realName); //用户名
        $(".userSex input[value="+userInfo.sex+"]").attr("checked","checked"); //性别
        $(".userPhone").val(userInfo.userPhone); //手机号
        $(".userBirthday").val(userInfo.userBirthday); //出生年月
        $(".userAddress select[name='province']").val(userInfo.province); //省
        //填充省份信息，同时调取市级信息列表
        var value = userInfo.province;
        var d = value.split('_');
        var code = d[0];
        var count = d[1];
        var index = d[2];
        if (count > 0) {
            loadCity(areaData[index].mallCityList);
            citys = areaData[index].mallCityList
        } else {
            $form.find('select[name=city]').attr("disabled","disabled");
        }
        $(".userAddress select[name='city']").val(userInfo.city); //市
        //填充市级信息，同时调取区县信息列表
        var value = userInfo.city;
        var d = value.split('_');
        var code = d[0];
        var count = d[1];
        var index = d[2];
        if (count > 0) {
            loadArea(citys[index].mallAreaList);
        } else {
            $form.find('select[name=area]').attr("disabled","disabled");
        }
        $(".userAddress select[name='area']").val(userInfo.area); //区
        $(".userEmail").val(userInfo.userEmail); //用户邮箱
       
        form.render();
    }
	*/
    
    $.fn.serializeObject = function() {
		var o = {};
		var a = this.serializeArray();
		$.each(a, function() {
			if (o[this.name] !== undefined) {
				if (!o[this.name].push) {
					o[this.name] = [ o[this.name] ];
				}
				o[this.name].push(this.value || '');
			} else {
				o[this.name] = this.value || '';
			}
		});
		return o;
	};
	function register() {
	var data = $("#registerForm").serializeObject()
	var provCode = data.province.split('_')[0]
	var cityList
	for(var i=0;i<address.length;i++){
		if(address[i].provinceCode==provCode){
			data.province = address[i].provinceName
			cityList = address[i].mallCityList
			break
		}
	}
	
	for(var i=0;i<cityList.length;i++){
		if(cityList[i].cityCode==data.city){
			data.city = cityList[i].cityName
			break
		}
	}
		var args = {}
		for(var key in data){
			var newKey = ""+key;
			newKey = newKey.substring(0,1).toUpperCase()+newKey.substring(1);
			args["u"+newKey] = data[key]
		}
		$.ajax({
			url : "/usedcar/user",
			type : "post",
			dataType : "json",
			contentType : "application/json",
			data : JSON.stringify(args),
			success : function(data) {
				data = eval("(" + data + ")")
				if (data.code == 201) {
					alert("注册成功")
					location.href = "login.html"
				} else {
					registered = false
					if("user has been used"==data.msg){
						alert("用户名已被注册")
					}
				}
			},
			error : function() {
				alert("add user error")
			}
		})
	}
    var registered = false
   form.on("submit(register)",function(data){
    	if(!registered){
    		register()
    		registered = true;
    	}
    	//var index = layer.msg('提交成功，稍候将跳转到登录页面',{icon: 16,time:50000,shade:0.8});
    });
    //提交个人资料
    form.on("submit(changeUser)",function(data){
    	var index = layer.msg('提交成功，稍候将跳转到登录页面',{icon: 16,time:50000,shade:0.8});
    });

    //修改密码
    form.on("submit(changePwd)",function(data){
    	var index = layer.msg('提交中，请稍候',{icon: 16,time:50000,shade:0.8});
        setTimeout(function(){
            layer.close(index);
            layer.msg("密码修改成功！");
            $(".pwd").val('');
        },2000);
    });

})

 //加载省数据
function loadProvince() {
    var proHtml = '';
    for (var i = 0; i < areaData.length; i++) {
        proHtml += '<option value="' + areaData[i].provinceCode + '_' + areaData[i].mallCityList.length + '_' + i + '">' + areaData[i].provinceName + '</option>';
    }
    //初始化省数据
    $form.find('select[name=province]').html()
    $form.find('select[name=province]').append(proHtml);
    form.render();
    form.on('select(province)', function(data) {
      //  $form.find('select[name=area]').html('<option value="">请选择县/区</option>');
        var value = data.value;
        var d = value.split('_');
        var code = d[0];
        var count = d[1];
        var index = d[2];
        if (count > 0) {
            loadCity(areaData[index].mallCityList);
        } else {
            $form.find('select[name=city]').attr("disabled","disabled");
        }
    });
}
//加载市数据
function loadCity(citys) {
    var cityHtml = '<option value="">请选择市</option>';
    for (var i = 0; i < citys.length; i++) {
         cityHtml += '<option value="' + citys[i].cityCode + '">' + citys[i].cityName + '</option>';
    }
    $form.find('select[name=city]').html(cityHtml).removeAttr("disabled");
    form.render();
    form.on('select(city)', function(data) {});  
}
 