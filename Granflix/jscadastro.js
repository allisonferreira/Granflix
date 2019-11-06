function confirmar(){
    if(email.value.length >=10 && email.value.indeOf("@")== -1){
        location.href = `./carrinho.html`;
    }else{
    alert('Senha Invalida');
}
}