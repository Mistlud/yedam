package com.prod.emp;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmpExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();

		// 메뉴 : 1전체조회 2ㅇ비력 3수정 4삭제 5한건조회 9종료
		while (true) {
			System.out.println("\n1. 사원리스트 | 2. 사원입력 | 3. 사원수정 | 4. 사원삭제 | 5. 사원조회 | 9. 종료");
			System.out.print("입력 > ");
			try {
				int menu = scn.nextInt();
				if (menu == 1) {
					List<Employee> list = dao.empList();
					System.out.println("<사원 리스트>");
					for (Employee emp : list) {
						System.out.println(emp.toString());
					}

				} else if (menu == 2) { // 입력
					Employee emp = new Employee();
					System.out.println("사원입력 메뉴입니다.");
					System.out.println("사원의 정보를 등록합시다.");
					System.out.println("새로 등록할 사원의 번호를 입력해 주십시오.");
					emp.setEmployeeID(scn.nextInt());
					System.out.println("새로 등록할 사원의 성을 입력해 주십시오.");
					emp.setLastName(scn.next());
					System.out.println("새로 등록할 사원의 E-mail을 입력해 주십시오.");
					emp.setEmail(scn.next());
					System.out.println("새로 등록할 사원의 고용일자를 입려해 주십시오.");
					emp.setHireDate(scn.next());
					System.out.println("새로 등록할 사원의 직무ID를 입력해 주십시오.");
					emp.setJobId(scn.next());
					dao.insertEmp(emp);

					boolean tof = dao.insertEmp(emp);
					if (tof) {
						System.out.println("정상입력되었습니다.");
					} else {
						System.out.println("오류 발생했습니다.");
					}

				} else if (menu == 3) { // 사원수정
					Employee emp = new Employee();
					System.out.println("수정할 사원의 번호를 입력해 주십시오.");
					int cnum = scn.nextInt();
					Employee emp2 = dao.check(cnum);
					if (emp2 == null) {
						System.out.println("조회 결과가 없습니다");
					} else {
						emp.setEmployeeID(cnum);
						System.out.println("사원의 이름을 입력해 주십시오.");
						emp.setFirstName(scn.next());
						System.out.println("사원의 연락처를 입력해 주십시오.");
						emp.setPhoneNumber(scn.next());
						System.out.println("사원의 급료를 입력해 주십시오.");
						emp.setSalary(scn.nextInt());
						dao.updateEmp(emp);
						System.out.println("완료되었습니다.");
					}
				} else if (menu == 4) {
					System.out.println("삭제할 사원의 번호를 입력하십시오.");
					dao.deleteEmp(scn.nextInt());
					System.out.println("삭제되었습니다.");

				} else if (menu == 5) {
					System.out.println("조회할 사원의 번호를 입력하십시오.");
					Employee emp = dao.lookupEmp(scn.nextInt());
					if (emp == null) {
						System.out.println("조회 결과가 없습니다");
					} else {
						System.out.println(emp.toString());
					}

				} else if (menu == 9) {
					System.out.println("종료합니다.");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다");
				scn.nextLine();
			}
		} // whileEND
		System.out.println("EoP");
		scn.close();
	} // mainEND
}
