package practice12_Q;

import java.util.ArrayList;

/*
 * [12-1] Ŭ���� Box�� ������ ���� ���ǵǾ� ���� ��, ���� �� ������ �߻��ϴ� ������?
��� �߻��ϴ� ������?
 * 
 * class Box<T> { // ���׸� Ÿ�� T�� ����
T item;
void setItem(T item) { this.item = item; }
T getItem() { return item; }
}

a. Box<Object> b = new Box<String>();
b. Box<Object> b = (Object)new Box<String>();
c. new Box<String>().setItem(new Object());
d. new Box<String>().setItem("ABC");

[����] a, b, c

[�ؼ�]
a. Box<Object> b = new Box<String>(); // ����. ���Ե� Ÿ���� �ݵ�� ���ƾ� �Ѵ�.
b. Box<Object> b = (Object)new Box<String>(); // ����. ObjectŸ���� Box<Object>Ÿ
���� ���������� ����Ұ�.(Ÿ�� ����ġ)
c. new Box<String>().setItem(new Object()); // ����. ���Ե� Ÿ���� String�̹Ƿ�,
setItem(T item)�� �Ű����� ����, StringŸ�Ը� ���ȴ�.
d. new Box<String>().setItem("ABC"); // OK. ���Ե� Ÿ���� String�� ��ġ�ϴ� Ÿ����
�Ű������� �����߱� ������ OK.

[12-2] ���׸� �޼��� makeJuice()�� �Ʒ��� ���� ���ǵǾ� ���� ��, �� �޼��带 �ù�
���� ȣ���� ������ ��� ���ÿ�. (Apple�� Grape�� Fruit�� �ڼ��̶�� ��������.)

class Juicer {
static <T extends Fruit> String makeJuice(FruitBox<T> box) {
String tmp = "";
for(Fruit f : box.getList()) tmp += f + " ";
return tmp;
}
}

a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
d. Juicer.makeJuice(new FruitBox<Apple>());
e. Juicer.makeJuice(new FruitBox<Object>());

[����] c, d

[�ؼ�]
a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>()); // ����. ���׸� �޼��忡 ���Ե�
Ÿ���� Apple�̹Ƿ�, �� �޼����� �Ű������� 'FruitBox<Apple>'Ÿ���� �ȴ�. new
FruitBox<Fruit>()�� �Ű������� Ÿ�԰� ��ġ���� ������, �ڵ�����ȯ�� �Ұ����� Ÿ����
�Ƿ� �����̴�.
b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>()); // ����. Grape�� Fruit�� �ڼ���
��� �ص�, Ÿ���� �ٸ��� ������ ���� ������ ����.
c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>()); // OK.
d. Juicer.makeJuice(new FruitBox<Apple>()); // OK. ���׸� �޼����� Ÿ�� ȣ���� ��
���� ����. �������� �ʾҴٸ�, ��Juicer.<Apple>makeJuice(new FruitBox<Apple>());'��
����. ��κ��� ��� ��ó�� �����Ѵ�.
e. Juicer.makeJuice(new FruitBox<Object>()); // ����. ���׸� �޼����� Ÿ�� ȣ����
�������� �ʾҴٸ�, ��Juicer.<Object>makeJuice(new FruitBox<Object>());'�� ����. d
���� ���Ͱ��� Ÿ���� ��ġ�ϱ� ������, <T extends Fruit>�� ������ �ɷ������Ƿ�, Ÿ
�� T�� Fruit�� �ڼ��̾�� �Ѵ�. Object�� Fruit�� �ڼ��� �ƴϹǷ� ����.


[12-3] ���� �� �ùٸ��� ���� ������ ��� ���ÿ�.
class Box<T extends Fruit> { // ���׸� Ÿ�� T�� ����
T item;
void setItem(T item) { this.item = item; }
T getItem() { return item; }
}

a. Box<?> b = new Box();
b. Box<?> b = new Box<>();
c. Box<?> b = new Box<Object>();
d. Box<Object> b = new Box<Fruit>();
e. Box b = new Box<Fruit>();
f. Box<? extends Fruit> b = new Box<Apple>();
g. Box<? extends Object> b = new Box<? extends Fruit>();

[����] c, d, g

[�ؼ�]
a. Box<?> b = new Box(); // OK. Box<?>�� Box<? extends Object>�� �ٿ��� ���̴�. ��
ü ������ ���׸� Ÿ���� ������ ���� �ʾ����� ������ ������ �ʴ´�. �׷���, new
Box()��� new Box<>()�� ����ϴ� ���� ����.
b. Box<?> b = new Box<>(); // OK. new Box<>();�� Ÿ���� ������ ������, �Ϲ������δ�
���������� Ÿ�԰� ���� Ÿ������ ���ֵȴ�. ���������� Ÿ���� <?>, �� <? extends
Object>�̹Ƿ� ������ Ÿ���� Object�̶�� �����ϱ� ���, ���⼭�� ���׸� Ŭ����
Box�� ���ǵ� Ÿ���� <T extends Fruit>�� ���� ���ѵǾ� �ֱ� ������, 'Object'�� �ƴ�
��Fruit'�� ������ ������ ���� �Ѵ�. �׷��� Box<?> b = new Box<Object>();�� ����
�ϸ� ������ �߻��Ѵ�. Object�� Fruit�� �ڼ��� �ƴϱ� �����̴�.

Box<?> b = new Box<>(); // OK. Box<?> b = new Box<Fruit>();�� ����
Box<?> b = new Box<Object>(); // ����
Box<?> b = new Box<Fruit>(); // OK

��Box<? extends Object>���� Box<Object>�� ���� ������ ��������. ���׸� Ŭ���� Box��
Ÿ�� T�� Fruit�� �ڼ����� ���ѵǾ� �ֱ� ������, Box<Object>�� ���� Fruit�� �ڼ���
�ƴ� Ŭ������ ������ �� ����. �׷���, 'Box<? extneds Object>'�� ���� ���ϵ� ī�带
����ϴ� ���� �����ϴ�.
c. Box<?> b = new Box<Object>(); // ���� b�� ���� ����
d. Box<Object> b = new Box<Fruit>(); // ����. Ÿ�� ����ġ
e. Box b = new Box<Fruit>(); // OK. �ٶ������� ����.��Box<?> b���� �� ����.
f. Box<? extends Fruit> b = new Box<Apple>(); // OK.
g. Box<? extends Object> b = new Box<? extends Fruit>(); // ����. new�����ڴ� Ÿ��
�� ��Ȯ�ؾ��ϹǷ� ���ϵ� ī��� ���� ���Ұ�


[12-4] �Ʒ��� �޼���� �� ���� ArrayList�� �Ű������� �޾Ƽ�, �ϳ��� ���ο�
ArrayList�� �����ϴ� �޼����̴�. �̸� ���׸� �޼���� �����Ͻÿ�.

	public static <? extends Product> ArrayList<? extends Product> merge(
			ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
			ArrayList<? extends Product> newList = new ArrayList<>(list);
			newList.addAll(list2);
			return newList;
	}
	
	public static <T extends Product> ArrayList<T> merge(
			ArrayList<T> list, ArrayList<T> list2) {
			ArrayList<T> newList = new ArrayList<>(list);
			newList.addAll(list2);
			return newList;
	}
	
 */
public class Practice12_1_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
