package br.unit.aps01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Desaja marcar uma consulta? \n"
                + "Digite 0 para NÃO \n"
                + "Digite 1 para SIM" );
        int consulta = input.nextInt();
        
        while (consulta == 1){
            System.out.println("Deseja iniciar o cadastro? \n"
                + "Digite 0 para NÃO \n"
                + "Digite 1 para SIM" );
            int cadastro = input.nextInt();
            while (cadastro == 1){
                System.out.println("Cadastrar Dentista? \n"
                    + "Digite 0 para NÃO \n"
                    + "Digite 1 para SIM");
                int cadastroDent = input.nextInt();
                if (cadastroDent == 1){
                    ArrayList<CadastroDentista> dentistaList = new ArrayList<CadastroDentista>();
                    CadastroDentista dentista = new CadastroDentista();

                    for (int cro = 0; cro > 0; cro++){
                        dentista.setCro(cro);
                        input = new Scanner(System.in);
                        System.out.print("Insira o nome do Dentista: ");
                        dentista.setNome(input.nextLine());
                        //String cadastro = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
                        dentista.setCadastro(Calendar.getInstance().getTime());
                        System.out.print("Insira a data de nascimento: ");
                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                        dentista.setNacimento(format.parse(input.next()));
                        dentistaList.add(dentista);
                        dentista = new CadastroDentista();
                    }
                }else{
                    System.out.print("Cadastrar Paciente? \n"
                    + "Digite 0 para NÃO \n"
                    + "Digite 1 para SIM");
                    int cadastroPac = input.nextInt();
                    if (cadastroPac == 1){
                        ArrayList<CadastroPaciente> pacienteList = new ArrayList<CadastroPaciente>();
                        CadastroPaciente paciente = new CadastroPaciente();

                       for (int cpf = 0; cpf > 0; cpf++){
                           paciente.setCpf(cpf);
                           input = new Scanner(System.in);
                           System.out.print("Insira o nome do paciente: ");
                           paciente.setNome(input.nextLine());
                           paciente.setCadastro(Calendar.getInstance().getTime());
                           System.out.print("Insira a data de nascimento: ");
                           SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                           paciente.setNascimento(format.parse(input.next()));
                           input = new Scanner(System.in);
                           paciente.setEndereco(input.nextLine());
                           pacienteList.add(paciente);
                           paciente = new CadastroPaciente();
                       }
                    }else{
                        break;
                    }
                }
            }
        }
        
        }           
    }
