class LockAdapter implements LegacyLockSystem {
    private OldLockSystem oldLockSystem;

    public LockAdapter(OldLockSystem oldLockSystem) {
        this.oldLockSystem = oldLockSystem;
    }

    @Override
    public void unlock() {
        oldLockSystem.oldUnlockMethod();
    }
}
