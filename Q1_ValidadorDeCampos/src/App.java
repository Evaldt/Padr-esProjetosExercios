public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        String matricula = "251054434";
        String numError = "1234asd34gd";

        Email validaEmail = new Email();
        Inteiro validaInteiro = new Inteiro();
        Matricula validaMatricula = new Matricula();

        if (validaEmail.valida(Tipo.EMAIL, email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }
        if (validaMatricula.valida(Tipo.MATRICULA, matricula)){
            System.out.println(matricula+" é uma matrícula válida!");
        }else{
            System.out.println(matricula+" não é uma matrícula válida!");
        }
        if (validaInteiro.valida(Tipo.INTEIRO, numError)){
            System.out.println(numError+" é um número inteiro válido!");
        }else{
            System.out.println(numError+" não é um número inteiro válido!");
        }

    }
}
