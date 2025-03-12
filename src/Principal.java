public class Principal {

    public static void main (String[] args){
    Gerente f1;
    f1 = new Gerente("JOAO", "119561", 5000F);
    Caixa f2;
    f2 = new Caixa();

    
    f2.setNome("MARIA");//nome ="MARIA";
    f2.setMatricula("037830");//matricula ="037830";
    f2.setSalario(3000f);//salario =3000f;
    
    System.out.println("nome " + f1);
    System.out.println("nome " + f2);
    
    }}