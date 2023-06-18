package main;

import java.util.Date;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PKCS12Attribute;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.management.loading.PrivateClassLoader;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.swing.JList;

public class Main extends JFrame {
	private JButton btClienteCadastro;
	private JButton btPetCadastro;
	private JButton btPetListaButton;
	private JButton btClientListButton;
	private JButton btProvisaoButton;
	private JButton btBuyPetButton;
		
	public Main () {
		this.setTitle("My Littlest PetShop");
		setBounds(700,300,405,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		//Botões
		btClienteCadastro = new JButton(); //Cadastrar Cliente
		btClienteCadastro.setText("Cadastrar Cliente");
		btClienteCadastro.setBounds(40, 40, 145, 50);
		this.add(btClienteCadastro);
		
		btPetCadastro = new JButton(); //Cadastrar Pet
		btPetCadastro.setText("Cadastrar Pet");
		btPetCadastro.setBounds(205, 40, 145, 50);
		this.add(btPetCadastro);
		
		btClientListButton = new JButton(); //Consultar Clientes
		btClientListButton.setText("Consultar Lista(Clientes)");
		btClientListButton.setBounds(40, 100, 145, 50);
		this.add(btClientListButton);
		
		btPetListaButton = new JButton(); //Consultar Pets
		btPetListaButton.setText("Consultar Lista(Pets)");
		btPetListaButton.setBounds(205, 100, 145, 50);
		this.add(btPetListaButton);
		
		btProvisaoButton = new JButton(); //Relatar gastos Futuros
		btProvisaoButton.setText("Relatar Gastos");
		btProvisaoButton.setBounds(40, 160, 145, 50);
		this.add(btProvisaoButton);
		
		btBuyPetButton = new JButton();
		btBuyPetButton.setText("Comprar Pet"); //Comprar Pet
		btBuyPetButton.setBounds(205, 160, 145, 50);
		this.add(btBuyPetButton);
		
		//Listas
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		ArrayList<Pets> petLista = new ArrayList<>();
	
		
		//Auxiliares
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();

		//Funcionamento dos Botões
		//1.Botão de Cadastrar Cliente
		btClienteCadastro.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Cliente c1 = new Cliente();
				c1.setNome(JOptionPane.showInputDialog("Insira o Nome do Cliente:"));
				c1.setCPF(JOptionPane.showInputDialog("Insira o CPF do Cliente"));
				c1.setTelefone(JOptionPane.showInputDialog("Insira o Telefone do Cliente"));
				listaClientes.add(c1);
			}
		});
		//2.Botão de Cadastrar Pet
		btPetCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Var e Atributos
				Pets p1 = new Pets();
				int cont = 0;
				String s1;
				String s2;
				int age;
				int escolha;
				Double racao;
				String s3 = "";
				String s4 = "";
				String s5 = "";
				String s6 = "";
				//Métodos
				p1.setID(listaClientes.size()+1);
				p1.setNome(JOptionPane.showInputDialog("Insira o Nome do Pet"));
				p1.setNick(JOptionPane.showInputDialog("Insira o Apelido do Pet"));
				s1 = (JOptionPane.showInputDialog("Insira a Idade do Pet"));
				age = Integer.parseInt(s1);
				p1.setAge(age);
				s6 = JOptionPane.showInputDialog("Insira o peso do Animal");
				p1.setWeight(Double.parseDouble(s6));
				s5 = JOptionPane.showInputDialog("Insira o Sexo do Pet(M/F)");
				s5.toUpperCase();
				p1.setSexo(s5);
				p1.setDogfood_type(JOptionPane.showInputDialog("Insira o tipo de Ração"));
				s2 = (JOptionPane.showInputDialog("Insira a Qtd. de Ração do Pet(Em Gramas)"));
				racao = Double.parseDouble(s2);
				p1.setDogfood_qtd(racao);
				s3 = (JOptionPane.showInputDialog("Insira o tipo de Animal\n(1 - Cão/2 - Gato/3 - Pássaro/0 - Erro)"));
				escolha = Integer.parseInt(s3);
				if(escolha == 1){
					s4 = JOptionPane.showInputDialog("Qual tipo de pelagem?(S/pelo,Raso,Curto,Semi-longo)");
					p1.setEspecialidade(s4);
					p1.setTipo("Cão");
				}
				if(escolha == 2) {
					s4 = JOptionPane.showInputDialog("É domesticado?(S/N)");
					p1.setEspecialidade(s4);
					p1.setTipo("Gato");
				}
				if(escolha == 3) {
					s4 = JOptionPane.showInputDialog("Asas cortadas?(S/N)");
					p1.setEspecialidade(s4);
					p1.setTipo("Pássaro");
				}
				if (escolha == 0) {
					JOptionPane.showMessageDialog(null, "Tipo de Animal Inválido");
				}
				p1.setEntrada(dateFormat.format(date));
				p1.setVendidoString("NÃO");
				petLista.add(p1);
			}
		});
		//3.Listar Clientes
		btClientListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Cliente c1: listaClientes) {
					JOptionPane.showMessageDialog(null, "|Clientes|\n"+"Nome: "+c1.getNome()+"\nCPF: "
													+c1.getCPF()+"\nTelefone: "+c1.getTelefone(), "|Clientes|", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		//4.Listar Pets
		btPetListaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Pets p1 : petLista) {
					JOptionPane.showMessageDialog(null,"|Pets|\n"+"ID: "+p1.getID()+"\nNome: "+p1.getNome()+"\nApelido: "+p1.getNick()+ "\nAnimal: "+p1.getTipo()+"\nEspecialidade: "+p1.getEspecialidade()+
												"\nSexo: "+p1.getSexo()+"\nPeso: "+p1.getWeight()+"\nEntrada: "+p1.getEntrada()+ "\nIdade: "+p1.getAge()+"\nTipo de Ração: "+p1.getDogfood_type()
												+"\nQtd. de Ração: "+p1.getDogfood_qtd()+"g","|Pets",JOptionPane.INFORMATION_MESSAGE);
				}	
			}
		});
		//5.Comprar o pet
		btBuyPetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ID;
				String identidadeString;
				String cPFString;
				String cPFComprador;
				cPFString = JOptionPane.showInputDialog("Insira o CPF do Cliente: ");
				for (Cliente c1: listaClientes) {
					if (cPFString.equals(c1.getCPF())) {
						cPFComprador = c1.getCPF();
						identidadeString = JOptionPane.showInputDialog("Insira o ID do Animal");
						ID = Integer.parseInt(identidadeString);
							for(Pets p1: petLista) {
								if(ID == p1.getID()) {
									p1.setCPF(cPFComprador);
									p1.setSaida(dateFormat.format(date));
									p1.setVendidoString("VENDIDO");
								}
							}
					} if (cPFString != c1.getCPF()) {
						JOptionPane.showMessageDialog(null,"CPF NÃO EXISTE","Error",JOptionPane.WARNING_MESSAGE);
					}
				}		
			}
		});
		//6.Listar Gastos Futuros
		btProvisaoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String naovendaString = "NÃO";
				for(Pets p1:petLista) {
					if(naovendaString.equalsIgnoreCase(p1.getVendidoString())) {
						double SomaRacao = 0;
						Double totalDouble;
						SomaRacao = 0 + p1.getDogfood_qtd();
						totalDouble = SomaRacao*7;
						JOptionPane.showMessageDialog(null,"|Pets|\n"+"ID: "+p1.getID()+"\nNome: "+p1.getNome()+"\nApelido: "+p1.getNick()+ "\nAnimal: "+p1.getTipo()+"\nEspecialidade: "+p1.getEspecialidade()+
								"\nSexo: "+p1.getSexo()+"\nPeso: "+p1.getWeight()+"\nEntrada: "+p1.getEntrada()+ "\nIdade: "+p1.getAge()+"\nTipo de Ração: "+p1.getDogfood_type()
								+"\nQtd. de Ração: "+p1.getDogfood_qtd()+"g"+"\nVendido: "+p1.getVendidoString(),"|Pets|",JOptionPane.INFORMATION_MESSAGE);	
						JOptionPane.showMessageDialog(null, "Quantidade de Ração Semanal: "+totalDouble);
					}
				}
			}
		});
	}
	public static void main(String[] args) {
		Main tela = new Main();
		tela.setVisible(true);
	}
}
