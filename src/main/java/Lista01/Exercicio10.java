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
 * @brief class Exercicio10
 */
public class Exercicio10 {
    public static void main(String[] args) {
        	   Scanner scanner = new Scanner(System.in);

	        while (scanner.hasNext()) {
	            int L = scanner.nextInt(); // Número de lesmas
	            int maxSpeed = 0; // Velocidade máxima encontrada

	            for (int i = 0; i < L; i++) {
	                int speed = scanner.nextInt();

	                // Verifica se a velocidade é maior que a máxima encontrada até agora
	                if (speed > maxSpeed) {
	                    maxSpeed = speed;
	                }
	            }

	            // Determina o nível de velocidade da lesma mais veloz
	            if (maxSpeed < 10) {
	                System.out.println(1);
	            } else if (maxSpeed < 20) {
	                System.out.println(2);
	            } else {
	                System.out.println(3);
	            }
	        }

	        scanner.close();
	    }
	
	}
    

