const app = new Vue({
    el: "#app",
    data: {
        tipoTabla: 0,
        perdidos: [],
        encontrados:[]
    },
    created() {
        var urlPer = 'postgres://quwhxshzqyjtzy:fc6be089f887c0a86c5b3b1c8a1eab1017e1494eb6d74a35e8b3b94ab8d77761@ec2-23-23-181-251.compute-1.amazonaws.com:5432/perdidos';
        var urlEnc = 'postgres://quwhxshzqyjtzy:fc6be089f887c0a86c5b3b1c8a1eab1017e1494eb6d74a35e8b3b94ab8d77761@ec2-23-23-181-251.compute-1.amazonaws.com:5432/encontrados';
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