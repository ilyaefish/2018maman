package Maman12Q1;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Q1Demo {
	static int NUM_OF_Expression = 10;
	static int MAX_NUM = 25;
	static int MIN_NUM = 0;

	public static void main(String[] args) {

		ArrayList<Expression> random_arr = new ArrayList<Expression>(NUM_OF_Expression);
		System.out.println("Those are the expression thate were Randomy generated\n");
		for (int i = 0; i < NUM_OF_Expression; i++) {
			// this will give us 0 to 2
			int rand = new Random().nextInt(3);
			// O will stand for AtomicExpression
			if (rand == 0) {
				AtomicExpression temp = new AtomicExpression(generate_random());
				random_arr.add(i, temp);

			}
			// 1 will stand for AdditionExpression
			if (rand == 1) {
				Expression first_exp = new AtomicExpression(generate_random());
				Expression second_exp = new AtomicExpression(generate_random());
				AdditionExpression temp = new AdditionExpression(first_exp, second_exp);
				random_arr.add(i, temp);

			}
			// 2 will stand for SubstractionExpression
			else {
				Expression first_exp = new AtomicExpression(generate_random());
				Expression second_exp = new AtomicExpression(generate_random());
				SubtractionExpression temp = new SubtractionExpression(first_exp, second_exp);
				random_arr.add(i, temp);

			}

		}
		for (int i = 0; i < NUM_OF_Expression; i++) {
			double t = random_arr.get(i).calculate();
			System.out.println(String.format("Index:%d)Exprettion: %-8s Equals: %.0f", i, random_arr.get(i), t));
			for (int y = 0; y < NUM_OF_Expression; y++) {
				if ((i != y) && (random_arr.get(i).equals(random_arr.get(y)))) {
					System.out.println(String.format("        %-8s Equals: %s from index %d",
							random_arr.get(i).toString(), random_arr.get(y).toString(), y));
				}

			}
			System.out.println("##########################################");
		}

	}

	public static int generate_random() {

		return ThreadLocalRandom.current().nextInt(MIN_NUM, MAX_NUM + 1);

	}
}
