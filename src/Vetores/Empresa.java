package Vetores;

public class Empresa {
    public static void main(String[] args){
        SetorPessoal setor = new SetorPessoal();

        Funcionario func1 = new Funcionario(1, "maria", 1, 1200.00, "vendedor");
        Funcionario func2 = new Funcionario(2, "jorge", 2, 3000.00, "gerente");
        setor.adicionarFuncionario(func1);
        setor.adicionarFuncionario(func2);

        //removendo funcionario
        setor.removeFuncionario(func2);

        //listando funcionarios
        Funcionario[] func = setor.listarFuncionario();
        for (Funcionario f: func){
            System.out.println("nome: "+f.getNome()+", matricula: "+f.getMatricula());
        }

        //dados do funcionario

        Funcionario dadosFunc = setor.buscarFuncionario("maria");
        if (dadosFunc != null){
            System.out.println("fumcionario encontrado: "+dadosFunc.getNome());
        }else{
            System.out.println("fumcionario não encontrado");

        }
    }
}
