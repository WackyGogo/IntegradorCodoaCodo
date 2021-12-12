const app = new Vue({
    el: "#app",
    data: {
        tipoTabla: 0,
        perdidos: []
    },
    created() {
        var url = 'http://localhost:8080/perdidos';
        this.fetchData(url);
    },
    methods: {
        fetchData(url) {
            fetch(url)
                .then(response => response.json())
                .then(data => {
                    this.perdidos = data;
                    console.log(data);
                    this.loading = false;
                    console.log(this.loading);
                })
                .catch(err => {
                    this.errored = true
                    console.error(err);
                })
        }
    }
})