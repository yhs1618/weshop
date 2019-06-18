package tech.wetech.weshop.dto;

public class CollectAddOrDeleteResultDTO {

    private HandleType type;

    public CollectAddOrDeleteResultDTO() {
    }

    public CollectAddOrDeleteResultDTO(HandleType type) {
        this.type = type;
    }

    public enum HandleType {
        add, delete
    }

    public HandleType getType() {
        return type;
    }

    public CollectAddOrDeleteResultDTO setType(HandleType type) {
        this.type = type;
        return this;
    }
}
