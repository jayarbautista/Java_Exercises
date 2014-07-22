class Help3 {
	public static void main(String args[]) throws java.io.IOException {
		
		char choose, ignore;
		
		do {
			System.out.println("Help on: ");
			System.out.println("\t1. if\n\t2. switch\n\t3. for\n\t4. while\n\t5. do-while\n\t6. break\n\t7. continue");
			System.out.print("Choose one (q to quit): ");
			choose = (char)System.in.read();
			
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
		}while (choose < '1' | choose > '7' & choose != 'q');
		
		switch(choose) {
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println("	case constant:");
				System.out.println("		statement sequence");
				System.out.println("		break;");
				System.out.println("	//...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("The for: \n");
				System.out.println("for(init; condition; iteration)");
				System.out.println("	statement;");
				break;
			case '4':
				System.out.println("The while:\n");
				System.out.println("while(condition) statement;");
				break;
			case '5':
				System.out.println("The do-while: \n");
				System.out.println("do {");
				System.out.println("	statement;");
				System.out.println("} while(condition);");
				break;
			case '6':
				System.out.println("The break:\n");
				System.out.println("break; or break label;");
				break;
			case '7':
				System.out.println("The continue:\n");
				System.out.println("continue; or continue label;");
				break;
			default:
				System.out.println("Invalid input.");
		}
	}
}
