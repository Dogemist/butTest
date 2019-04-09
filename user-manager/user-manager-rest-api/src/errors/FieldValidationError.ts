import { AppError, ErrorToJSON } from './AppError';
import { ErrorType } from './errorCodeMap';
import { ValidationErrorItem } from '../middlewares/ValidationErrorItem';

export interface FieldValidationErrorToJSON extends ErrorToJSON {
  fields: ValidationErrorItem[];
}

export class FieldValidationError extends AppError {
  private fields: ValidationErrorItem[];

  constructor(message: string, fields: ValidationErrorItem[]) {
    super({
      code: ErrorType.FIELD_VALIDATION_ERROR,
      errorKey: 'FIELD_VALIDATION_ERROR',
      message,
    });
    this.fields = fields;
  }

  /**
   * @Override toJSON method from AppError
   */
  toJSON(): FieldValidationErrorToJSON {
    const json = super.toJSON() as FieldValidationErrorToJSON;
    json.fields = this.fields;
    return json;
  }
}
