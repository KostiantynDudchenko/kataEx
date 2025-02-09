package javaCore.t2t4t18;

/*��� ��� ������ ����� � �������� ����� � ���� ������� �������. ������ ������� �������� ����� ����
 � ��������� ����: ����: �����
        ����� ����� ��������� ����� �������.

        �������� �����, ������� ����� ������������ ������� �� �����, ��������������� �� � ����������
        ��������� � ���� �������� ������ (��. ������). ������ ������ ��������������� � ��������� ����:

        ����:
        i) �����
        j) �����2
        ...
        ==������� ������==

        i � j -- ������ ����� � ��������. ���������� ������� ���������� � �������, �������� ������
         ������� � ������������ � �������� �����. �������� ����� ����� �������� �����������,
          �������� ����� � ����� ������ �� �����������.

        �������, ��� ��� ��������� ��������� �������� ����� � 50 000 ����� ��� 10 ����� � ��������������,
         ������������ ������ �������������� ������� ����� ����� �� ����������� �� �������.

        �������� �������� ��� �� ��������� �������:
        ��� ��������� ����� ����������� � ������ ����� ������ ����, � ��� ����� � ����������;
        �������� ����� ���� ����� ���� ��������� �������� ������ ���� (��������, "����" � "���� �����");
        ����, � ������� ��� ������, ���� ������ �������������� � �������� �����;
        � �������� �������� ������ ���� ������������ ������ '\n' (������� ������ � ����� UNIX);
        ������ �����������, �� ���������� ������ �������� � ����� �����.

        ������ ����� 1:
        roles:
        ����������
        ����� ���������
        ������� ����������
        ���� �����
        textLines:
        ����������: � ��������� ���, �������, � ���, ����� �������� ��� ������������� ��������: � ��� ���� �������.
        ����� ���������: ��� �������?
        ������� ����������: ��� �������?
        ����������: ������� �� ����������, ���������. � ��� � ��������� ������������.
        ����� ���������: ��� �� ��!
        ������� ����������: ��� �� ���� ������, ��� �����!
        ���� �����: ������� ����! ��� � � ��������� ������������!
        ������ ������ 1:
        ����������:
        1) � ��������� ���, �������, � ���, ����� �������� ��� ������������� ��������: � ��� ���� �������.
        4) ������� �� ����������, ���������. � ��� � ��������� ������������.

        ����� ���������:
        2) ��� �������?
        5) ��� �� ��!

        ������� ����������:
        3) ��� �������?
        6) ��� �� ���� ������, ��� �����!

        ���� �����:
        7) ������� ����! ��� � � ��������� ������������!


        ����������:
        1. ����� ������ ���� ���������.
        2. ����� ������ ��������� �� ���� ��� ������� �����.
        3. ����� ������ ���������� ������.
        4. �������������� ������ ������ ��������������� �c�����.
        5. ���������� ������������ StringBuilder*/

public class RoleList {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        int a = 0;
        StringBuilder result = new StringBuilder();
        result.append("\n");
        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i]).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    result.append(j + 1).append(')').append(textLines[j].substring(roles[i].length() + 1, textLines[j].length())).append('\n');
                }
            }
            result.append('\n');
        }//���� ��� �����
        return result.toString();
    }

    public static void main(String[] args) {
        String[] roles = new String[]{
                "����������",
                "����� ���������",
                "������� ����������",
                "����",
                "��� �������",
                "���� �����"};
        String[] textLines = new String[]{
                "����������: � ��������� ���, �������, � ���, ����� �������� ��� ������������� ��������: � ��� ���� �������.",
                "����� ���������: ��� �������?",
                "������� ����������: ��� �������?",
                "����������: ������� �� ����������, ���������. � ��� � ��������� ������������.",
                "����� ���������: ��� �� ��!",
                "������� ����������: ��� �� ���� ������, ��� �����!",
                "���� �����: ������� ����! ��� � � ��������� ������������!",
                "����: ������� ����! � ������ ��� ���������� ���� �� �������������!"
        };

        String result = RoleList.printTextPerRole(roles, textLines);

        System.out.println(result);

    }
}
