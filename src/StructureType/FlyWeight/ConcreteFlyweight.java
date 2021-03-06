package StructureType.FlyWeight;

/**
 * @Author zzguo
 * @Description 接口实现类 享元对象
 * @Date 2021/12/30
 **/
public class ConcreteFlyweight implements Flyweight {

    // 内部状态 享元对象共享内部状态
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
