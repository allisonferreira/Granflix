function validacao(){

    mensagem_email.innerHTML = "";
    mensagem_login.innerHTML = "";
    mensagem_senha.innerHTML = "";
    mensagem_checkbox.innerHTML = "";
    mensagem_idade.innerHTML = "";

    var email = email_validacao.value;
    var login = login_validacao.value;
    var senha = senha_validacao.value;
    //var checkbox = validacao_checkbox.value;
    var idade = validacao_idade.value;

    //if(email == "" || email.indexOf ("@") == -1 || login == "" || login.length <2 || senha == "" 
    //|| senha.length <5 || senha.length >14 || validacao_checkbox.checked == false || idade == ""){

        if(email == "" || email.indexOf ("@") == -1){
        mensagem_email.innerHTML = `<span style="color: #e41515;"> E-mail inválido.</span>`;
        }
        if(login == "" || login.length <2){
        mensagem_login.innerHTML = `<span style="color: #e41515;"> Login inválido.</span>`
        }
        if(senha == "" || senha.length >14 || senha.length <5){
        mensagem_senha.innerHTML = `<span style="color: #e41515;">Inválido, Tenha 5 e menos de 15 caracteres, <br>incluindo um número e uma letra maiúscula</span>`;
        }
        if(idade == ""){
            mensagem_idade.innerHTML = `<span style="color: #e41515;"> Insira sua idade.</span>`;
        }

        form = document.forms[0]
        checkbox = form.checkbox;

        if(validacao_checkbox.checked == false){
        mensagem_checkbox.innerHTML =  `<span style="color: #e41515;">Aceite os termos.</span>`;
        form.checkbox.focus()
        return false;
        }
        else{
        location.href = `../Index.html`;
        
    }
}