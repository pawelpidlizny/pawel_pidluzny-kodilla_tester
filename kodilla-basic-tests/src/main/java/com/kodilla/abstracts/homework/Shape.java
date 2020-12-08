package com.kodilla.abstracts.homework;

class Punkt {
    int x;
    int y;

    Punkt(int a, int b) {
        x = a;
        y = b;
    }

    double odleglosc(Punkt pt) {
        return Math.sqrt((x - pt.x) * (x - pt.x) + (y - pt.y) * (y - pt.y));
    }
}

class Odcinek {
    Punkt pt1;
    Punkt pt2;

    Odcinek(int x1, int y1, int x2, int y2) {
        pt1 = new Punkt(x1, y1);
        pt2 = new Punkt(x2, y2);
    }

    Odcinek(Punkt pt1, Punkt pt2) {
        this.pt1 = pt1;
        this.pt2 = pt2;
    }

    double dlugosc() {
        return pt1.odleglosc(pt2);
    }
}

class Trojkat {
    Punkt pt1, pt2, pt3;

    Trojkat(Punkt pt1, Punkt pt2, Punkt pt3) {
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.pt3 = pt3;
    }

    double obwod() {
        return pt1.odleglosc(pt2) + pt2.odleglosc(pt3) + pt3.odleglosc(pt1);
    }

    double pole() {
        double a = new Odcinek(pt1, pt2).dlugosc();
        double b = new Odcinek(pt2, pt3).dlugosc();
        double c = new Odcinek(pt3, pt1).dlugosc();

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


