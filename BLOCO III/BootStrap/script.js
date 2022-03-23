var Nome = window.document.querySelector('#Nome')

var okNome = false

function validarNome() {
    let txtNome = document.getElementById('txtNome')
    if(Nome.value.lenght < 2) {
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
        alert('Mensagem enviada com sucesso')
    }else {
        alert('Erro! Preencha corretamente.')
    }
}