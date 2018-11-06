/**
 * @author liqiang
 * 时间 2018-11-01 15:43
 * 描述
 */
$(document).ready(function () {
    new Vue({
        el:"#app",
        methods:{
            logout:function () {
                window.location.href = Lee.realPath + "/logout";
            }
        }
    })
});