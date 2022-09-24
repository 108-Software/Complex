public class Complex {
    double real, image;
    double real2, image2;

    Complex(double real, double image){

    }

    public double abs(){                //возвращает модуль числа
        return Math.hypot(real,image);
    }

    public double arg(){         //возвращает аргумент комплексных чисел
        return Math.atan2(image,real);
    }

    double SumRe(double real, double real2){        //Сумма действительных частей
        double resultRe;
        resultRe = real + real2;
        return resultRe;
    }

    double SumIm(double image, double image2){      //Сумма мнимых частей
        double resultIm;
        resultIm = image + image2;
        return resultIm;
    }

    double SubRe(double real, double real2){        //Разница действительных частей
        double resultRe;
        resultRe = real - real2;
        return resultRe;
    }

    double SubIm(double image, double image2){      //Разница мнимых частей
        double resultIm;
        resultIm = image - image2;
        return resultIm;
    }

}
