import static java.lang.Math.PI;
import static java.lang.Math.cos;

import java.util.concurrent.CyclicBarrier;

public class AdvectionGalerkin implements Problem {

    private static final double beta = 1;

    private double F(double t) {
        return 2 * PI * cos(2 * PI * t);
    }

    @Override
    public Production makeA1(Vertex v, double h, double dt, double t, CyclicBarrier barrier) {
        return new ABase(v, h, dt, t, barrier) {
            @Override
            Vertex apply(Vertex v) {
                return v;
            }
        };
    }

    @Override
    public Production makeA(Vertex v, double h, double dt, double t, CyclicBarrier barrier) {
        return new ABase(v, h, dt, t, barrier) {
            @Override
            Vertex apply(Vertex v) {
                return v;
            }
        };
    }

    @Override
    public Production makeAN(Vertex v, double h, double dt, double t, CyclicBarrier barrier) {
        return new ABase(v, h, dt, t, barrier) {
            @Override
            Vertex apply(Vertex v) {
                return v;
            }
        };
    }

}
