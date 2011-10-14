package nextapp.echo.extras.app.layout;

import nextapp.echo.app.ImageReference;
import nextapp.echo.app.LayoutData;

/**
 *
 * @author sieskei
 */
public interface TabableLayoutData extends LayoutData
{
  public ImageReference getIcon();
  public void setIcon(ImageReference ir);
  public String getTitle();
  public void setTitle(String string);
}
