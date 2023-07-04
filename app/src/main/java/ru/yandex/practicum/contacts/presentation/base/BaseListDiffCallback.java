package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<BaseListDiffCallback<T>>> extends DiffUtil.ItemCallback<BaseListDiffCallback<T>> {
    @Override
    public boolean areItemsTheSame(@NonNull BaseListDiffCallback<T> oldItem, @NonNull BaseListDiffCallback<T> newItem) {
        return oldItem == newItem;
    }


    @Override
    public boolean areContentsTheSame(@NonNull BaseListDiffCallback oldItem, @NonNull BaseListDiffCallback newItem) {
        return false;
    }
}
