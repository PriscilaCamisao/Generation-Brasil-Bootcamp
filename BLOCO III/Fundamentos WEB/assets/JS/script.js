/*acessando o documento widows e puxando as informações do Contato.html atraves do Input*/
var Nome = window.document.querySelector('#Nome')

var okNome = false

/*Função para validar o Nome*/
function validarNome() {
    let txtNome = document.getElementById('txtNome')
        /*Chamei a variavel para saber se o valor é menor que 3, vai aparecer um alerta*/
        if(Nome.value.length < 2) {
            txtNome.innerHTML = 'Nome inválido!'
            txtNome.style.color = 'red'
            okNome = false
        }else {
            txtNome.innerHTML = 'Nome correto!'
            txtNome.style.color = 'green'
            okNome = true
        }
}

function Enviar() {
    if(okNome == true) {
        alert('Mensagem enviada com sucesso!')
    }else {
        alert('Erro! Preencha corretamente.')
    }

}