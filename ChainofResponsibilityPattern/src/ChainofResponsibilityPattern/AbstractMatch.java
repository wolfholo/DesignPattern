
package ChainofResponsibilityPattern;

public abstract class AbstractMatch {
    protected boolean match;

    protected AbstractMatch nextMatch;

    public void setNextMatch(AbstractMatch nextMatch){
        this.nextMatch = nextMatch;
    }

    public void matchMessage(){
        if(this.match){
            write();
        }
        if(nextMatch !=null){
            nextMatch.matchMessage();
        }
    }

    abstract protected void write();

}