public class Gerente extends Funcionario{
    
    public Gerente(){
                
    }
    
    public Gerente (float salario){
    
    }
    
    public Gerente(){
        System.out.println("Criando objeto Gerente");
    }
    
    public Gerente(
                    String nome, 
                    String matricula, 
                    Float salario
    ){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario(salario);        
    }
    
    public void cancelarCompra(){
        System.out.println("Compra cancelada");
    }

    @Override
    public String toString() {
        return "Nome" + this.getNome(); 
        
         }
}
