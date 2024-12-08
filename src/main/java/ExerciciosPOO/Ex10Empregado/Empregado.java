package ExerciciosPOO.Ex10Empregado;

public class Empregado {

    //Atributos da classe Empregado
    private String nome; //Nome do empregado
    private String departamento; //departamento onde o empregado trabalha
    private int horasTrabalhadasNoMes; //número de horas trabalhads no mês
    private double salarioPorHora; //salário por hora do empregado

    //Construtor da clase para inicializar os atributos
    public Empregado(String nome, String departamento, int horasTrabalhadasNoMes, double salarioPorHora) {
        this.nome = nome; //inicializa o nome do empregado
        this.departamento = departamento; //inicializa o departamento do empregado
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes; //inicializa as horas trabalhadas no mês
        this.salarioPorHora = salarioPorHora; // inicializa o salário por hora
    }

    //Método para calcular o salário mensal do empregado
    public double calculaSalarioMensal() {
        return horasTrabalhadasNoMes * salarioPorHora;
    }

    //Metodo para exibir os dados do empregado
    public void mostraDados() {
        //Exibe as informações do empregado
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas trabalhadas no mês: " + horasTrabalhadasNoMes);
        System.out.println("Salário por Hora: " + salarioPorHora);
        System.out.println("Salário mensal: " + calculaSalarioMensal());
    }

    //Metodos getters e setters para acessar e modificar os atributos da classe

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getHorasTrabalhadasNoMes() {
        return horasTrabalhadasNoMes;
    }

    public void setHorasTrabalhadasNoMes(int horasTrabalhadasNoMes) {
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
}
