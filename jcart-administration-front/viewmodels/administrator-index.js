var app = new Vue({
    el: '#app',
    data: {
        pageInfo: '',
        pageNum: 1
    },
    mounted(){
        console.log('view mounted');
        this.getAdministrators();
    },
    methods:{
        handlePageChange(val){
            console.log('page change',val);
            this.pageNum=val;
            this.getAdministrators();
        },
        handleDelete(index,row){
            console.log('delete click');

            if(confirm("确认删除吗?")){
                this.dleteAdministrator(row.administratorId);
            }
        },
        dleteAdministrator(administratorId){
            axios.post('/administrator/delete', administratorId,{
                headers: {
                    'Content-Type': 'application/json'
                }
            })
              .then(function (response) {
                console.log(response);
                alert('删除成功');
                location.reload();
              })
              .catch(function (error) {
                console.log(error);
              });
        },
        getAdministrators(){
            axios.get('/administrator/getList', {
                params: {
                  pageNum: this.pageNum
                }
              })
              .then(function (response) {
                console.log(response);
                app.pageInfo=response.data;
              })
              .catch(function (error) {
                console.log(error);
              });  
        }
    }
})