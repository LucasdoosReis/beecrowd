/*
 * Copyright (C) 2024 Lucas  Reis <lucaslladder@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista01;
import java.util.Scanner;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 02/03/24
 * @brief class Exercicio07
 */
public class Exercicio07 {
    public static void main(String[] args) {
        		 Scanner scanner = new Scanner(System.in);

	        while (true) {
	            int x = scanner.nextInt();
	            int y = scanner.nextInt();

	            // Verifica se pelo menos uma coordenada é nula para encerrar o programa
	            if (x == 0 || y == 0) {
	                break;
	            }

	            // Determina o quadrante
	            if (x > 0 && y > 0) {
	                System.out.println("primeiro");
	            } else if (x < 0 && y > 0) {
	                System.out.println("segundo");
	            } else if (x < 0 && y < 0) {
	                System.out.println("terceiro");
	            } else if (x > 0 && y < 0) {
	                System.out.println("quarto");
	            }
	        }

	        scanner.close();
	    }
	}

    

