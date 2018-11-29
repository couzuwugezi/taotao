/**
 * @author liqiang
 * 时间 2018-11-29 14:41
 * 描述
 */
$(document).ready(function () {
    var header = new Vue({
        el: '#header',
        methods: {
            deleteUser: function () {
                this.$prompt('请输入待删除的用户名', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                }).then(({value}) => {
                    $.ajax({
                        url: Lee.realPath + "/deleteUser/" + value,
                        type: "POST",
                        dataType: "json",
                        success: function (response) {
                            let msg = '';
                            if (response == '1') {
                                msg = "删除成功";
                            } else {
                                msg = "操作失败";
                            }
                            header.$message(msg);
                        },
                        error: function (error) {
                            header.$message("系统异常!");
                            console.log(error);
                        }
                    })
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '取消操作'
                    });
                });
            },
            logout: function () {
                window.location.href = Lee.realPath + "/logout";
            }
        }
    })
});