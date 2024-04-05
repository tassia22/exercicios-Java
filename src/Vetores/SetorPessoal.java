package Vetores;

import java.util.ArrayList;
import java.util.List;

public class SetorPessoal {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public boolean adicionarFuncionario(Funcionario funcionario){
        if (funcionario == null){
            return false;
        }
       return funcionario.add(funcionario);

    }
    public boolean removeFuncionario(Funcionario funcionario){
        return funcionario.remove(funcionario);

    }
    public Funcionario buscarFuncionario(int matricula){
        for (Funcionario func : funcionarios){
            if (func.getMatricula() == matricula){
                return func;
            }

        }
        return null;

    }
    public Funcionario buscarFuncionario(String nome){
        for (Funcionario func: funcionarios){
            if (func.getNome().equals(nome)){
                return func;
            }
        }
        return null;

    }
    public Funcionario[] listarFuncionario(int departamento){

        List<Funcionario> funcioarioDepartamento = new ArrayList<>();
        for (Funcionario func: funcionarios){
            if (func.getDepartamento() == departamento){
                funcioarioDepartamento.add(func);
            }
        }
        return funcioarioDepartamento.toArray(new Funcionario[0]);

    }
    public Funcionario[] listarFuncionario(String funcao){
       List<Funcionario> funcionarioFuncao = new ArrayList<>();
       for (Funcionario func: funcionarios){
           if (func.getFuncao().equals(funcao)){
               funcionarioFuncao.add(func);
           }
       }
       return funcionarioFuncao.toArray(new Funcionario[0]);

    }
    public Funcionario[] listarFuncionario(){
        return  funcionarios.toArray(new Funcionario[0]);

    }
}
