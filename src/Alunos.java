public class Alunos {
    
    private String nome; //Organizados em get/set
    private int idade;
    private double media;  
    
    
 public String getNome(){
        return nome; 
        //O método Getter, retorna o valor do atributo especificado.

    }

    public void setNome(String newNome){
        this.nome = newNome;
        //O método Setter, define outro novo valor para o atributo especificado.
        
    } 

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }

    public double getMedia(){
        return media;
        
    }

    public void setMedia(int newMedia){
        this.media = newMedia;
    }
    

}