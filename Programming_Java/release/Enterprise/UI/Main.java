package Enterprise.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import Enterprise.Class.Empleado;
import Enterprise.Class.EmpleadoOperativo;
import Enterprise.Class.EmpleadoOutSourcing;
import Enterprise.Class.EmpleadoProfesional;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelContent = new JPanel();
		frame.getContentPane().add(panelContent, BorderLayout.CENTER);

		JLabel lblEjemploDeHeriencia = new JLabel("Ejemplo de Heriencia y Polimorfismo");
		lblEjemploDeHeriencia.setBounds(89, 11, 262, 20);
		lblEjemploDeHeriencia.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 46, 414, 2);
		panelContent.setLayout(null);

		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 67, 414, 145);
		panelContent.add(textPane);
		panelContent.add(lblEjemploDeHeriencia);
		panelContent.add(separator);

		JButton btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					StyledDocument docTextPane = textPane.getStyledDocument();

					Empleado marioGutierrez = new EmpleadoOutSourcing(2321939, "Carlos Mario Gutierrez", 24, 'M',
							4568900, "Calle falsa 456", 3000000, "Tecnico TI", new Date(), new Date());
					Empleado germanCifuentes = new EmpleadoOperativo(37378282, "German Cifuentes", 34, 'M', 3829898,
							"Calle falsa 789", 7500000, "Maestro Especializacion", new Date(), new Date());
					Empleado juanMartinez = new EmpleadoProfesional(1022966500, "Juan Fernando Martinez", 30, 'M',
							7563000, "Calle falsa 123", 4000000, "Profesional de BI", new Date(), new Date(),
							"Ingeniero de Sistemas", "Universidad Libre", new Date());

					/**
					 * Employees that request increase your salary
					 */
					marioGutierrez.requestSalary(200000);
					germanCifuentes.requestSalary(1300);
					juanMartinez.requestSalary(6000);

					/**
					 * Calculation of salary
					 */
					docTextPane.insertString(
							docTextPane.getEndPosition().getOffset(), "El salario del empleado: "
									+ germanCifuentes.get_name() + " es: " + germanCifuentes.calculateSalary() + " \n",
							null);

					docTextPane.insertString(docTextPane.getEndPosition().getOffset(), "El salario del empleado: "
							+ juanMartinez.get_name() + " es: " + juanMartinez.calculateSalary() + "\n\n", null);

					/**
					 * Mark entries and outs of employees
					 */
					EmpleadoProfesional javierLadino = new EmpleadoProfesional(1022966500, "Javier Orlando Ladino", 24,
							'M', 4817776, "Calle falsa 901", 3000000, "Ingeniero de Desarrollo", new Date(), new Date(),
							"Ingeniero de Sistemas", "Universidad Libre", new Date());

					boolean markEntry = javierLadino.markEntry(new Date("25/03/2016 08:10:00"));
					boolean markOut = javierLadino.markOut(new Date("25/03/2016 17:00:00"));

					/**
					 * Get information of employees
					 */
					docTextPane.insertString(docTextPane.getEndPosition().getOffset(),
							marioGutierrez.getInformation() + "\n\n", null);
					docTextPane.insertString(docTextPane.getEndPosition().getOffset(),
							germanCifuentes.getInformation() + "\n\n", null);
					docTextPane.insertString(docTextPane.getEndPosition().getOffset(),
							javierLadino.getInformation() + "\n\n", null);

				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			}
		});
		btnEjecutar.setBounds(190, 223, 89, 23);
		panelContent.add(btnEjecutar);

		JScrollPane scrollPane = new JScrollPane(textPane);
		scrollPane.setBounds(10, 59, 414, 153);
		panelContent.add(scrollPane);

	}
}
