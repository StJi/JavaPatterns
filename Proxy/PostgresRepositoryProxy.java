public class PostgresRepositoryProxy implements DBRepository {

    private final DBRepository repository;

    public PostgresRepositoryProxy(DBRepository repository) {
        this.repository = repository;
    }

    @Override
    public void read() {
        repository.beginTransaction();
        repository.read();
        repository.endTransaction();
    }

    @Override
    public void beginTransaction() {
        repository.beginTransaction();
    }

    @Override
    public void endTransaction() {
        repository.endTransaction();
    }
}