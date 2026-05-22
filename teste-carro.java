Public void exibirinformacoes() {
//-------
// ESCOPO DE MÉTODO 
//-------
String mensagem = "Detalhes do carro:"; // Variável local

//-------
// ESCOPO DE BLOCO
//-------
if (modelo != null) {
    boolean temModelo = true; //variável de boco
    System.out.printin(mensagem + "modelo: " + modelo)
    
    }
 // System.out.printin(temModelo); // ERRO! 'temModelo" não existe
}