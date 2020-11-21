package carrosEje;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TallerMecanico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Taller taller;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	/**
	 * Create the frame.
	 */
	public TallerMecanico() {
		configurarVentana();		
		inicializaValores();	
	}
	
	  private void configurarVentana() {
	    	this.setTitle("Taller Mec�nico");     	
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(450, 300); 
			setLocationRelativeTo(null);
	        this.setResizable(false);                               
	    }

		
	public void inicializaValores() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taller=new Taller("Car Service", "Calle de las Flores #24, Col. Villas, Del. Benito Juarez, CDMX");
		
		JLabel lblSasas = new JLabel(taller.getRazonSocial());
		lblSasas.setHorizontalAlignment(SwingConstants.CENTER);
		Font f= new Font("Arial", Font.BOLD, 18);
		lblSasas.setFont(f);
		lblSasas.setBounds(0, 0, 428, 20);
		contentPane.add(lblSasas);
		
		JLabel lblTallerMecanico = new JLabel(taller.getDireccion());
		lblTallerMecanico.setHorizontalAlignment(SwingConstants.CENTER);
		Font f1= new Font("Arial", Font.ITALIC, 14);
		lblTallerMecanico.setFont(f1);
		lblTallerMecanico.setBounds(0, 21, 428, 20);
		contentPane.add(lblTallerMecanico);
		
		JButton btnMecanico = new JButton("+ Datos Mecanicos");
		btnMecanico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingresaMecanicos();
			}
			
		});
		btnMecanico.setBounds(20, 67, 174, 29);
		contentPane.add(btnMecanico);
		
		JButton btnNewButton = new JButton("Autos Reparados x Mes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((taller.getMecanico1().getAutos()==null || taller.getMecanico1().getAutos().size()==0)
						&& (taller.getMecanico2().getAutos()==null || taller.getMecanico2().getAutos().size()==0)
							&& (taller.getMecanico3().getAutos()==null || taller.getMecanico3().getAutos().size()==0)){
					JOptionPane.showMessageDialog(contentPane, "No hay Autos registrados");
				}else {
					JOptionPane.showMessageDialog(contentPane, "Autos Reparados en el mes Octubre del a�o actual: "+
				(taller.getMecanico1().totalDeAutosReparadosXMes(10,2020)+
				taller.getMecanico2().totalDeAutosReparadosXMes(10,2020)+
				taller.getMecanico3().totalDeAutosReparadosXMes(10,2020)));
				}
			}
		});
		btnNewButton.setBounds(20, 125, 174, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Comisi�n por Auto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((taller.getMecanico1().getAutos()==null || taller.getMecanico1().getAutos().size()==0)
						&& (taller.getMecanico2().getAutos()==null || taller.getMecanico2().getAutos().size()==0)
							&& (taller.getMecanico3().getAutos()==null || taller.getMecanico3().getAutos().size()==0)){
					JOptionPane.showMessageDialog(contentPane, "No hay Autos registrados");
				}else {
					
					Auto autoBusqueda=null;
					
					for(int i=0; i<taller.getMecanico1().getAutos().size(); i++) {
						if(taller.getMecanico1().getAutos().get(i).getPlacas().equals("GTV-127"))
							autoBusqueda=taller.getMecanico1().getAutos().get(i);
					}
					
					JOptionPane.showMessageDialog(contentPane, "Comision Por Auto Placas GTV-127: "
							+(autoBusqueda!=null?taller.getMecanico1().obtenerComision(autoBusqueda):"No se encuentra el auto"));
					//busqueda de otro auto
					autoBusqueda=null;
					
					for(int i=0; i<taller.getMecanico1().getAutos().size(); i++) {
						if(taller.getMecanico1().getAutos().get(i).getPlacas().equals("ASR-148"))
						autoBusqueda=taller.getMecanico1().getAutos().get(i);
					}
					
					JOptionPane.showMessageDialog(contentPane, "Comision Por Auto Placas ASR-148: "
							+(autoBusqueda!=null?taller.getMecanico1().obtenerComision(autoBusqueda):"No se encuentra el auto"));
				}
			}
		});
		btnNewButton_1.setBounds(20, 170, 174, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Autos No Reparados");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((taller.getMecanico1().getAutos()==null || taller.getMecanico1().getAutos().size()==0)
						&& (taller.getMecanico2().getAutos()==null || taller.getMecanico2().getAutos().size()==0)
							&& (taller.getMecanico3().getAutos()==null || taller.getMecanico3().getAutos().size()==0)){
					JOptionPane.showMessageDialog(contentPane, "No hay Autos registrados");
				}else {
					String autosNoReparados="";
					for(Auto a: taller.getMecanico1().mostrarAutosNoReparados()) {
						autosNoReparados+="\n "+a.getPlacas()+" ingreso en "+sdf.format(a.getFechaEntrada());
					}
					JOptionPane.showMessageDialog(contentPane, "Autos Reparados: "
							+taller.getMecanico1().mostrarAutosNoReparados().size()
							+autosNoReparados);
				}
			}
		});
		btnNewButton_2.setBounds(20, 215, 174, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+ Auto");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresaAutos();
				
			}
		});
		btnNewButton_3.setBounds(238, 67, 174, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Autos en Reparaci�n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((taller.getMecanico1().getAutos()==null || taller.getMecanico1().getAutos().size()==0)
						&& (taller.getMecanico2().getAutos()==null || taller.getMecanico2().getAutos().size()==0)
							&& (taller.getMecanico3().getAutos()==null || taller.getMecanico3().getAutos().size()==0)){
					JOptionPane.showMessageDialog(contentPane, "No hay Autos registrados");
				}else {
					String autosNoReparados="";
					for(Auto a:taller.getMecanico1().mostrarAutosNoReparados()) {
						autosNoReparados+="\n "+a.getPlacas()+" ingreso en "+sdf.format(a.getFechaEntrada());
					}
					JOptionPane.showMessageDialog(contentPane, sdf.format(new Date())+"\nAutos En Reparaci�n Mecanico "+taller.getMecanico1().getNombre()
							+" <"+taller.consultaAutosEnReparacion(taller.getMecanico1()).size()+">"
							+autosNoReparados);
				}
			}
		});
		btnNewButton_4.setBounds(238, 125, 174, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Salario + Comisi�n");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((taller.getMecanico1().getAutos()==null || taller.getMecanico1().getAutos().size()==0)
						&& (taller.getMecanico2().getAutos()==null || taller.getMecanico2().getAutos().size()==0)
							&& (taller.getMecanico3().getAutos()==null || taller.getMecanico3().getAutos().size()==0)){
					JOptionPane.showMessageDialog(contentPane, "No hay Autos registrados");
				}else {
					JOptionPane.showMessageDialog(contentPane, sdf.format(new Date())+"\nSalario del mes de octubre del a�o 2020 para "
							+" "+taller.calculaSalarioTotal(taller.getMecanico1(), 10, 2020));
				}
			}
		});
		btnNewButton_5.setBounds(238, 170, 174, 29); 
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel(sdf.format(new Date()));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 44, 428, 20);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("--------------------------------------------------------------------");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 101, 444, 20);
		contentPane.add(label);
	}
	
	public void ingresaAutos() {
		Auto auto=null;new Auto();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
		try {
			if(taller.getMecanico1().getAutos()==null || taller.getMecanico1().getAutos().size()==0) {
				auto=new Auto();
				auto.setPlacas("ABC-128");
				auto.setCostoReparacion(1500);		
				
				auto.setFechaEntrada(s.parse("24/07/2020"));
				
				auto.setFechaSalida(s.parse("30/07/2020"));
				taller.getMecanico1().agregarAuto(auto);
				
				auto=new Auto();
				auto.setPlacas("TBH-128");
				auto.setCostoReparacion(2500);		
				auto.setFechaEntrada(s.parse("24/10/2020"));
				auto.setFechaSalida(s.parse("30/10/2020"));		
				taller.getMecanico1().agregarAuto(auto);
				
				auto=new Auto();
				auto.setPlacas("GTR-4581");
				auto.setCostoReparacion(3200);		
				auto.setFechaEntrada(s.parse("14/10/2020"));
				auto.setFechaSalida(s.parse("30/10/2020"));		
				taller.getMecanico1().agregarAuto(auto);
				
				auto=new Auto();
				auto.setPlacas("FRE-2457");
				auto.setCostoReparacion(1300);		
				auto.setFechaEntrada(s.parse("21/10/2020"));
				auto.setFechaSalida(s.parse("25/10/2020"));		
				taller.getMecanico1().agregarAuto(auto);
				
				auto=new Auto();
				auto.setPlacas("TRE-1453");
				auto.setCostoReparacion(4500);		
				auto.setFechaEntrada(s.parse("11/10/2020"));
				auto.setFechaSalida(s.parse("25/10/2020"));		
				taller.getMecanico1().agregarAuto(auto);
				
				auto=new Auto();
				auto.setPlacas("BGH-9451");
				auto.setCostoReparacion(1500);		
				auto.setFechaEntrada(s.parse("09/10/2020"));
				auto.setFechaSalida(s.parse("15/10/2020"));		
				taller.getMecanico1().agregarAuto(auto);
				
				auto=new Auto();
				auto.setPlacas("ASR-148");
				auto.setCostoReparacion(2500);		
				auto.setFechaEntrada(s.parse("14/11/2020"));
				auto.setFechaSalida(s.parse("19/11/2020"));		
				taller.getMecanico1().agregarAuto(auto);
				
				auto=new Auto();
				auto.setPlacas("RDV-128");
				auto.setCostoReparacion(2500);		
				auto.setFechaEntrada(s.parse("18/11/2020"));
				taller.getMecanico1().agregarAuto(auto);
				
				auto=new Auto();
				auto.setPlacas("GTV-127");
				auto.setCostoReparacion(3500);		
				auto.setFechaEntrada(s.parse("15/11/2020"));
				taller.getMecanico1().agregarAuto(auto);
				
				auto=null;
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ingresaMecanicos(){
		taller.getMecanico1().setNombre("Hugo");
		taller.getMecanico1().setSalario(6000);
		taller.getMecanico2().setNombre("Paco");
		taller.getMecanico1().setSalario(6000);
		taller.getMecanico3().setNombre("Luis");
		taller.getMecanico1().setSalario(6000);

	}
}
