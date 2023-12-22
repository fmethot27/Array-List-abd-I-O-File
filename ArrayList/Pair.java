package Part1;

public class Pair<X, Y> {
private X first;
private Y second;

// Constructor
public Pair(X first, Y second) {
	this.first = first;
	this.second = second;
}

public X getFirst() {
	return first;
}

public void setFirst(X first) {
	this.first = first;
}

public Y getSecond() {
	return second;
}

public void setSecond(Y second) {
	this.second = second;
}

public void printPair() {
	System.out.println("Pair: (" + first + ", " + second + ")");
}

}
