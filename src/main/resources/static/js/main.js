const app = new Vue({
    el: "#app",
    data: {
        tipoTabla: 0,
        perdidos: [],
        encontrados:[]
    },
    created() {
        var urlPer = 'http://ec2-23-23-181-251.compute-1.amazonaws.com:5432/perdidos';
        var urlEnc = 'http://ec2-23-23-181-251.compute-1.amazonaws.com:5432/encontrados';
        this.fetchData(urlPer);
        this.fetchDataEnc(urlEnc);
    },
    methods: {
        fetchData(urlPer) {
            fetch(urlPer)
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
        },
        fetchDataEnc(urlEnc) {
            fetch(urlEnc)
                .then(response => response.json())
                .then(data => {
                    this.encontrados = data;
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