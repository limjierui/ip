package Duke.Commands;

import Duke.DukeException;
import Duke.Storage.Storage;
import Duke.Tasks.TaskList;
import Duke.Ui.Ui;

public abstract class Command {
    public abstract void executeCommand(TaskList tasks, Ui ui, Storage storage) throws DukeException;
    public abstract boolean isExit();
}