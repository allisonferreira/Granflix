function entrar() {
    if (email.value == 'admin' && senha.value == 'admin' || email.value == 'allison@bandtec.com.br' && senha.value =='granflix'){
        location.href = `carrinho.html`;
        
}else{
    alert('Email ou Senha Invalida');
}
}


