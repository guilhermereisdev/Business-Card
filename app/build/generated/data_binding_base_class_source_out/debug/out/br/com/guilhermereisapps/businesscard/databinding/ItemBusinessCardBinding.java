// Generated by view binder compiler. Do not edit!
package br.com.guilhermereisapps.businesscard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import br.com.guilhermereisapps.businesscard.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBusinessCardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView mcvContent;

  @NonNull
  public final MaterialTextView tvEmail;

  @NonNull
  public final MaterialTextView tvNome;

  @NonNull
  public final MaterialTextView tvNomeEmpresa;

  @NonNull
  public final MaterialTextView tvTelefone;

  private ItemBusinessCardBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView mcvContent, @NonNull MaterialTextView tvEmail,
      @NonNull MaterialTextView tvNome, @NonNull MaterialTextView tvNomeEmpresa,
      @NonNull MaterialTextView tvTelefone) {
    this.rootView = rootView;
    this.mcvContent = mcvContent;
    this.tvEmail = tvEmail;
    this.tvNome = tvNome;
    this.tvNomeEmpresa = tvNomeEmpresa;
    this.tvTelefone = tvTelefone;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBusinessCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBusinessCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_business_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBusinessCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mcv_content;
      MaterialCardView mcvContent = rootView.findViewById(id);
      if (mcvContent == null) {
        break missingId;
      }

      id = R.id.tv_email;
      MaterialTextView tvEmail = rootView.findViewById(id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tv_nome;
      MaterialTextView tvNome = rootView.findViewById(id);
      if (tvNome == null) {
        break missingId;
      }

      id = R.id.tv_nome_empresa;
      MaterialTextView tvNomeEmpresa = rootView.findViewById(id);
      if (tvNomeEmpresa == null) {
        break missingId;
      }

      id = R.id.tv_telefone;
      MaterialTextView tvTelefone = rootView.findViewById(id);
      if (tvTelefone == null) {
        break missingId;
      }

      return new ItemBusinessCardBinding((ConstraintLayout) rootView, mcvContent, tvEmail, tvNome,
          tvNomeEmpresa, tvTelefone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
